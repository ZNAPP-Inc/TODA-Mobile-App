package com.example.toda


import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.Canvas
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    private var mapFragment: SupportMapFragment?= null

    lateinit var fusedLocationProviderClient: FusedLocationProviderClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupmap()


        fusedLocationProviderClient=LocationServices.getFusedLocationProviderClient(this)

        findViewById<Button>(R.id.btn_get_location).setOnClickListener{
            fetchLocation()
        }
    }

    private fun setupmap() {
        mapFragment= supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)
    }

    private fun fetchLocation() {
        val task = fusedLocationProviderClient.lastLocation

        if(ActivityCompat.checkSelfPermission(this,android.Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED && ActivityCompat
                .checkSelfPermission(this,android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED
        ){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),101)
            return

        }
        task.addOnSuccessListener {
            if(it != null){
                Toast.makeText(applicationContext, "${it.latitude} ${it.longitude}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        var mMap = googleMap


        val latlon0 = LatLng(14.5988936, 121.0053501)

        //Manila
        val latlon1 = LatLng(14.600819,121.004582)
        val latlon2 = LatLng(14.599348,121.011761)

        //Quezon City
        val latlon3 = LatLng(14.650637,121.077718)
        val latlon4 = LatLng(14.647323,121.074198)
        val latlon5 = LatLng(14.641898,121.073724)
        val latlon6 = LatLng(14.641177,121.074379)
        val latlon7 = LatLng(14.632584,121.073613)


        val markerView= (getSystemService(LAYOUT_INFLATER_SERVICE)as LayoutInflater).inflate(R.layout.marker_layout, null)
        //val text= markerView.findViewById<TextView>(R.id.markerText)
        val cardView1= markerView.findViewById<CardView>(R.id.markerCardView)

        val LocationView= (getSystemService(LAYOUT_INFLATER_SERVICE)as LayoutInflater).inflate(R.layout.current_location_layout, null)
        //val text= LocationView.findViewById<TextView>(R.id.markerText)
        val cardView2= LocationView.findViewById<CardView>(R.id.LocationCardView)


        //text.text="Toda Station here!"
        val bitmap1= Bitmap.createScaledBitmap(viewToBitmap(cardView1)!!,cardView1.width, cardView1.height, false)
        val smallMarkerIcon1= BitmapDescriptorFactory.fromBitmap(bitmap1)
        googleMap!!.addMarker(MarkerOptions().position(latlon1).icon(smallMarkerIcon1))

        //text.text="Toda Station here!"
        val bitmap2= Bitmap.createScaledBitmap(viewToBitmap(cardView1)!!,cardView1.width, cardView1.height, false)
        val smallMarkerIcon2= BitmapDescriptorFactory.fromBitmap(bitmap2)
        googleMap!!.addMarker(MarkerOptions().position(latlon2).icon(smallMarkerIcon2))

        //text.text="Toda Station here!"
        val bitmap3= Bitmap.createScaledBitmap(viewToBitmap(cardView1)!!,cardView1.width, cardView1.height, false)
        val smallMarkerIcon3= BitmapDescriptorFactory.fromBitmap(bitmap3)
        googleMap!!.addMarker(MarkerOptions().position(latlon3).icon(smallMarkerIcon3))

        //text.text="Toda Station here!"
        val bitmap4= Bitmap.createScaledBitmap(viewToBitmap(cardView1)!!,cardView1.width, cardView1.height, false)
        val smallMarkerIcon4= BitmapDescriptorFactory.fromBitmap(bitmap4)
        googleMap!!.addMarker(MarkerOptions().position(latlon4).icon(smallMarkerIcon4))

        //text.text="Toda Station here!"
        val bitmap5= Bitmap.createScaledBitmap(viewToBitmap(cardView1)!!,cardView1.width, cardView1.height, false)
        val smallMarkerIcon5= BitmapDescriptorFactory.fromBitmap(bitmap5)
        googleMap!!.addMarker(MarkerOptions().position(latlon5).icon(smallMarkerIcon5))

        //text.text="Toda Station here!"
        val bitmap6= Bitmap.createScaledBitmap(viewToBitmap(cardView1)!!,cardView1.width, cardView1.height, false)
        val smallMarkerIcon6= BitmapDescriptorFactory.fromBitmap(bitmap6)
        googleMap!!.addMarker(MarkerOptions().position(latlon6).icon(smallMarkerIcon6))

        //text.text="Toda Station here!"
        val bitmap7= Bitmap.createScaledBitmap(viewToBitmap(cardView1)!!,cardView1.width, cardView1.height, false)
        val smallMarkerIcon7= BitmapDescriptorFactory.fromBitmap(bitmap7)
        googleMap!!.addMarker(MarkerOptions().position(latlon7).icon(smallMarkerIcon7))

        

        //text.text="Current Location here!"
        val bitmap0= Bitmap.createScaledBitmap(viewToBitmap(cardView2)!!,cardView1.width, cardView1.height, false)
        val smallMarkerIcon0= BitmapDescriptorFactory.fromBitmap(bitmap0)
        googleMap!!.addMarker(MarkerOptions().position(latlon0).icon(smallMarkerIcon0))


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latlon1, 10f))
    }

    private fun viewToBitmap(view: View): Bitmap?{
        view.measure(View.MeasureSpec.UNSPECIFIED,View.MeasureSpec.UNSPECIFIED)
        val bitmap= Bitmap.createBitmap(view.measuredWidth, view.measuredHeight,Bitmap.Config.ARGB_8888)
        val canvas= Canvas(bitmap)
        view.layout(0,0, view.measuredWidth, view.measuredHeight)
        view.draw(canvas)
        return bitmap

    }
}

