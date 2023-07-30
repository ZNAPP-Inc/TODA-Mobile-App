@file:Suppress("DEPRECATION")

package com.example.toda

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.location.Location
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
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

        //for restart button
        val restartButton: Button = findViewById(R.id.restartButton)
        restartButton.setOnClickListener {
            // Call the method to restart the app
            restartApp()
        }
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

        val latlonPUPCEA = LatLng(14.5988936, 121.0053501)


        //Manila
        val latlonMNL1 = LatLng(14.600819,121.004582)
        val latlonMNL2 = LatLng(14.599348,121.011761)
        val latlonMNL3 = LatLng(14.6073528,121.019157)
        val latlonMNL4 = LatLng(14.6181148,121.016164)
        val latlonMNL5 = LatLng(14.615180,121.014719)


        //Quezon City
        val latlonQC1 = LatLng(14.650637,121.077718)
        val latlonQC2 = LatLng(14.647323,121.074198)
        val latlonQC3 = LatLng(14.641898,121.073724)
        val latlonQC4 = LatLng(14.641177,121.074379)
        val latlonQC5 = LatLng(14.632584,121.073613)

        //Caloocan City
        //PALTODA Terminal Phase 3 - (14.7606780, 121.0355324)
        //PALTODA Terminal Phase 5 - (14.7613212, 121.0328324)
        //PALTODA Terminal Phase 1 - (14.7541742, 121.0401575)
        //PALTODA Waiting Area Zabarte Town Center - (14.7559817, 121.0424860)

        val latlonCLCN1 = LatLng(14.7606780, 121.0355324)
        val latlonCLCN2 = LatLng(14.7613212, 121.0328324)
        val latlonCLCN3 = LatLng(14.7541742, 121.0401575)
        val latlonCLCN4 = LatLng(14.7559817, 121.0424860)



        //Marikina City
        //LPSTODAI 1- (14.633703, 121.083765)
        //SRMTTODAI 2- (14.627250, 121.097291)
        //DACATODAI 3- (14.623483, 121.096391)
        //SELVTODAI 4- (14.632568, 121.096983)
        //JCSTODAI 5- (14.632679, 121.097748)
        //PTJTODAI 6- (14.634534, 121.088547)
        //KATODAI 7- (14.622781, 121.086930)
        //HRMRTODAI -

        val latlonMRKN1 = LatLng(14.633703, 121.083765)
        val latlonMRKN2 = LatLng(14.627250, 121.097291)
        val latlonMRKN3 = LatLng(14.623483, 121.096391)
        val latlonMRKN4 = LatLng(14.632568, 121.096983)
        val latlonMRKN5 = LatLng(14.632679, 121.097748)
        val latlonMRKN6 = LatLng(14.634534, 121.088547)
        val latlonMRKN7 = LatLng(14.622781, 121.086930)
        val latlonMRKN8 = LatLng(14.633465, 121.082405)
        val latlonMRKN9 = LatLng(14.635557, 121.098304)
        val latlonMRKN10 = LatLng(14.636369, 121.095595)
        val latlonMRKN11 = LatLng(14.634172, 121.095165)
        val latlonMRKN12 = LatLng(14.632494, 121.095510)
        val latlonMRKN13 = LatLng(14.636586, 121.097553)
        val latlonMRKN14 = LatLng(14.623405, 121.092817)
        val latlonMRKN15 = LatLng(14.632453, 121.082980)
        

        mMap!!.addMarker(MarkerOptions().position(latlonPUPCEA).title("PUP CEA"))

        mMap!!.addMarker(MarkerOptions().position(latlonMNL1).title("Toda in Manila City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMNL2).title("Toda in Manila City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMNL3).title("Toda in Manila City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMNL4).title("Toda in Manila City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMNL5).title("Toda in Manila City"))


        mMap!!.addMarker(MarkerOptions().position(latlonQC1).title("Toda in Quezon City"))
        mMap!!.addMarker(MarkerOptions().position(latlonQC2).title("Toda in Quezon City"))
        mMap!!.addMarker(MarkerOptions().position(latlonQC3).title("Toda in Quezon City"))
        mMap!!.addMarker(MarkerOptions().position(latlonQC4).title("Toda in Quezon City"))
        mMap!!.addMarker(MarkerOptions().position(latlonQC5).title("Toda in Quezon City"))


        mMap!!.addMarker(MarkerOptions().position(latlonCLCN1).title("PALTODA Terminal Phase 3 in Caloocan City"))
        mMap!!.addMarker(MarkerOptions().position(latlonCLCN2).title("PALTODA Terminal Phase 5 in Caloocan City"))
        mMap!!.addMarker(MarkerOptions().position(latlonCLCN3).title("PALTODA Terminal Phase 1 in Caloocan City"))
        mMap!!.addMarker(MarkerOptions().position(latlonCLCN4).title("PALTODA Waiting Area Zabarte Town Center in Caloocan City"))

        mMap!!.addMarker(MarkerOptions().position(latlonMRKN1).title("LPSTODAI Terminal in Marikina City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMRKN2).title("SRMTTODAI Terminal in Marikina City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMRKN3).title("DACATODAI Terminal in Marikina City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMRKN4).title("SELVTODAI Terminal in Marikina City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMRKN5).title("JCSTODAI Terminal in Marikina City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMRKN6).title("PTJTODAI Terminal in Marikina City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMRKN7).title("KATODAI Terminal in Marikina City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMRKN8).title("Toda in Marikina City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMRKN9).title("Toda in Marikina City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMRKN10).title("Toda in Marikina City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMRKN11).title("Toda in Marikina City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMRKN12).title("Toda in Marikina City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMRKN13).title("Toda in Marikina City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMRKN14).title("Toda in Marikina City"))
        mMap!!.addMarker(MarkerOptions().position(latlonMRKN15).title("Toda in Marikina City"))


        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(latlonPUPCEA, 10f))
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

    private fun restartApp() {
        // Create an intent to launch the initial activity of your app
        val intent = Intent(this, MainActivity::class.java)

        // Clear the activity stack and start the initial activity
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)

        // Finish the current activity to remove it from the stack
        finish()
    }
}