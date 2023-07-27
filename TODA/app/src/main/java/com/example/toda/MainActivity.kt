@file:Suppress("DEPRECATION")

package com.example.toda

import android.Manifest
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.location.Location
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import com.directions.route.AbstractRouting
import com.directions.route.Route
import com.directions.route.RouteException
import com.directions.route.Routing
import com.directions.route.RoutingListener
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.Polyline
import com.google.android.gms.maps.model.PolylineOptions
import com.google.android.material.snackbar.Snackbar


class MainActivity : FragmentActivity(), OnMapReadyCallback,
    GoogleApiClient.OnConnectionFailedListener,
    RoutingListener {
    //google map object
    private var mMap: GoogleMap? = null

    //current and destination location objects
    var myLocation: Location? = null
    var destinationLocation: Location? = null
    protected var start: LatLng? = null
    protected var end: LatLng? = null
    var locationPermission = false

    //polyline object
    private var polylines: MutableList<Polyline>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //request location permission.
        requestPermission()

        //init google map fragment to show map.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)

    }

    private fun requestPermission() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            )
            != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this, arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION),
                LOCATION_REQUEST_CODE
            )
        } else {
            locationPermission = true
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray,
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            LOCATION_REQUEST_CODE -> {
                if (grantResults.size > 0
                    && grantResults[0] == PackageManager.PERMISSION_GRANTED
                ) {
                    //if permission granted.
                    locationPermission = true
                    getMyLocation()
                } else {
                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                return
            }
        }
    }

    //to get user location
    private fun getMyLocation() {
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }
        mMap!!.isMyLocationEnabled = true
        mMap!!.setOnMyLocationChangeListener { location ->
            myLocation = location
            val ltlng = LatLng(location.latitude, location.longitude)
            val cameraUpdate = CameraUpdateFactory.newLatLngZoom(ltlng, 16f)
            mMap!!.animateCamera(cameraUpdate)
        }

        //get destination location when user click on map
        mMap!!.setOnMapClickListener { latLng ->
            end = latLng
            mMap!!.clear()
            start = LatLng(myLocation!!.latitude, myLocation!!.longitude)
            //start route finding
            Findroutes(start, end)
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        if (locationPermission) {
            getMyLocation()
        }

        //val latlonPUPCEA = LatLng(14.5988936, 121.0053501)


        //Manila
        val latlon1 = LatLng(14.600819,121.004582)
        val latlon2 = LatLng(14.599348,121.011761)

        //Quezon City
        val latlon3 = LatLng(14.650637,121.077718)
        val latlon4 = LatLng(14.647323,121.074198)
        val latlon5 = LatLng(14.641898,121.073724)
        val latlon6 = LatLng(14.641177,121.074379)
        val latlon7 = LatLng(14.632584,121.073613)

        //Marikina City



        mMap!!.addMarker(MarkerOptions().position(latlon1).title("Toda in Manila City"))
        mMap!!.addMarker(MarkerOptions().position(latlon2).title("Toda in Manila City"))
        mMap!!.addMarker(MarkerOptions().position(latlon3).title("Toda in Quezon City"))
        mMap!!.addMarker(MarkerOptions().position(latlon4).title("Toda in Quezon City"))
        mMap!!.addMarker(MarkerOptions().position(latlon5).title("Toda in Quezon City"))
        mMap!!.addMarker(MarkerOptions().position(latlon6).title("Toda in Quezon City"))
        mMap!!.addMarker(MarkerOptions().position(latlon7).title("Toda in Quezon City"))

    }



    private val bicycleIcon: BitmapDescriptor by lazy {
        val color = ContextCompat.getColor(this, R.color.white)
        BitmapHelper.vectorToBitmap(this, R.drawable.toda, color)
    }


    // function to find Routes.
    private fun Findroutes(Start: LatLng?, End: LatLng?) {
        if (Start == null || End == null) {
            Toast.makeText(this@MainActivity, "Unable to get location", Toast.LENGTH_LONG).show()
        } else {
            val routing = Routing.Builder()
                .travelMode(AbstractRouting.TravelMode.DRIVING)
                .withListener(this)
                .alternativeRoutes(true)
                .waypoints(Start, End)
                .key("AIzaSyCLggMgPZ2whs7xgJGRA-Y7lLTSgwgSodQ") //also define your api key here.
                .build()
            routing.execute()
        }
    }

    //Routing call back functions.
    override fun onRoutingFailure(e: RouteException) {
        val parentLayout = findViewById<View>(android.R.id.content)
        val snackbar = Snackbar.make(parentLayout, e.toString(), Snackbar.LENGTH_LONG)
        snackbar.show()
                Findroutes(start,end)
    }

    override fun onRoutingStart() {
        Toast.makeText(this@MainActivity, "Finding Route...", Toast.LENGTH_LONG).show()
    }

    //If Route finding success..
    override fun onRoutingSuccess(route: ArrayList<Route>, shortestRouteIndex: Int) {
        val center = CameraUpdateFactory.newLatLng(start)
        val zoom = CameraUpdateFactory.zoomTo(16f)
        if (polylines != null) {
            polylines!!.clear()
        }
        val polyOptions = PolylineOptions()
        var polylineStartLatLng: LatLng? = null
        var polylineEndLatLng: LatLng? = null
        polylines = ArrayList()
        //add route(s) to the map using polyline
        for (i in route.indices) {
            if (i == shortestRouteIndex) {
                polyOptions.color(resources.getColor(R.color.black))
                polyOptions.width(7f)
                polyOptions.addAll(route[shortestRouteIndex].points)
                val polyline = mMap!!.addPolyline(polyOptions)
                polylineStartLatLng = polyline.points[0]
                val k = polyline.points.size
                polylineEndLatLng = polyline.points[k - 1]
                (polylines as ArrayList<Polyline>).add(polyline)
            } else { }
        }

        //Add Marker on route starting position
        val startMarker = MarkerOptions()
        startMarker.position(polylineStartLatLng!!)
        startMarker.title("My Location")
        mMap!!.addMarker(startMarker)

        //Add Marker on route ending position
        val endMarker = MarkerOptions()
        endMarker.position(polylineEndLatLng!!)
        endMarker.title("Destination")
        mMap!!.addMarker(endMarker)
    }

    override fun onRoutingCancelled() {
        Findroutes(start, end)
    }

    override fun onConnectionFailed(connectionResult: ConnectionResult) {
        Findroutes(start, end)
    }

    companion object {
        //to get location permissions.
        private const val LOCATION_REQUEST_CODE = 23
    }
}