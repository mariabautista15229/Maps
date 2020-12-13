package com.example.mapping;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

//ACT 1.Maria Jesa Bautista

        LatLng phs = new LatLng( 38.7259306, -77.5806861); //Patriot High
        LatLng homeVA = new LatLng(38.7427216, -77.5869252); //virginia home
        LatLng homeUC = new LatLng(15.9866, 120.5706); //urdaneta home
        LatLng merryl = new LatLng(15.979215,120.566625); //marryland
        LatLng ucu = new LatLng(15.9806,   120.5606); //ucu

        mMap.addMarker(new MarkerOptions().position(phs).title("Marker in Patriot High School").snippet("Maria Jesa Bautista").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(homeVA).title("Marker in Home Virginia").snippet("Maria Jesa Bautista").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(homeUC).title("Marker in Home Urdaneta").snippet("Maria Jesa Bautista").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(ucu).title("Marker in Urdaneta City University").snippet("Maria Jesa Bautista").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(merryl).title("Marker in Merryland").snippet("Maria Jesa Bautista").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(phs));



//ACT 2.Maria Jesa Bautista
        mMap.addCircle(new CircleOptions() //bahay sa virginia
                .center(new LatLng(38.7427216, -77.5869252))
                .radius(1000)
                .strokeWidth(10)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 0, 255, 0)));

        mMap.addCircle(new CircleOptions() //bahay sa urdaneta
                .center(new LatLng(15.9866, 120.5706))
                .radius(1000)
                .strokeWidth(10)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 0, 255, 0)));



//ACT 3.Maria Jesa Bautista
        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.9866, 120.5706), //homeUC
                        new LatLng(15.979215,120.566625), //merryland
                        new LatLng(15.9806,120.5606)) //ucu
                .width(10)
                .color(Color.GREEN));


        mMap.addPolygon(new PolygonOptions()
                .add(new LatLng(15.9866, 120.5706),  //maria's home
                        new LatLng(15.7990,  120.5768), //raymart's  home
                        new LatLng(16.0708, 120.7830))  //aireen's home
                .strokeColor(Color.WHITE)
                .fillColor(Color.argb(128, 255, 0, 0)));



        //raymart
        LatLng ans = new LatLng( 15.7868, 120.5883); //Aringin National High school
        LatLng house = new LatLng( 15.7990,  120.5768); //house
        LatLng sanma = new LatLng( 15.8291, 120.6027); //san manuel
        LatLng smros = new LatLng( 15.8793, 120.6025); //sm rosales
        LatLng urda = new LatLng( 15.9758, 120.5707); //urdaneta
        LatLng ucu2 = new LatLng( 15.9806,   120.5606); //ucu


        mMap.addMarker(new MarkerOptions().position(ans).title("Marker in Aringin National High school").snippet("Raymart D. Umipig").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.addMarker(new MarkerOptions().position(house).title("Marker in House").snippet("Raymart D. Umipig").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.addMarker(new MarkerOptions().position(sanma).title("Marker in San Manuel").snippet("Raymart D. Umipig").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.addMarker(new MarkerOptions().position(smros).title("Marker in SM Rosales").snippet("Raymart D. Umipig").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.addMarker(new MarkerOptions().position(urda).title("Marker in Urdaneta").snippet("Raymart D. Umipig").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        mMap.addMarker(new MarkerOptions().position(ucu2).title("Marker in Urdaneta City University").snippet("Raymart D. Umipig").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));


        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.7990,  120.5768))
                .radius(1000)
                .strokeWidth(10)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 0, 255, 0)));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.7990,  120.5768), //sanroque house
                        new LatLng(15.8291, 120.6027), //san manuel
                        new LatLng(15.8793, 120.6025), //sm rosales
                        new LatLng(15.9758, 120.5707), //urdaneta
                        new LatLng(15.9806,   120.5606)) //ucu
                .width(10)
                .color(Color.MAGENTA));


        //aireen
        LatLng rah = new LatLng( 16.46  , 120.4538); //Red Arrow High school 16.46  , 120.4538
        LatLng bahay = new LatLng( 16.0708, 120.7830); //bahay
        LatLng tayug = new LatLng( 16.0109, 120.7465); //tayug
        LatLng stma = new LatLng( 15.9801, 120.7000); //st maria
        LatLng asin = new LatLng( 16.0044, 120.6545); //asingan
        LatLng urdan = new LatLng( 15.9758, 120.5707); //urdaneta
        LatLng ucu3 = new LatLng( 15.9806,   120.5606); //ucu


        mMap.addMarker(new MarkerOptions().position(rah).title("Marker in Red Arrow High school").snippet("Aireen V. Umlas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(bahay).title("Marker in House").snippet("Aireen V. Umlas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(tayug).title("Marker in Tayug").snippet("Aireen V. Umlas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(stma).title("Marker in Sta. Maria").snippet("Aireen V. Umlas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(asin).title("Marker in Asingan").snippet("Aireen V. Umlas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(urdan).title("Marker in Urdaneta").snippet("Aireen V. Umlas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        mMap.addMarker(new MarkerOptions().position(ucu3).title("Marker in Urdaneta City University").snippet("Aireen V. Umlas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));



        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.0708, 120.7830))
                .radius(1000)
                .strokeWidth(10)
                .strokeColor(Color.RED)
                .fillColor(Color.argb(128, 0, 255, 0)));


        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.0708, 120.7830), //bahay
                        new LatLng(16.0109, 120.7465), //tayug
                        new LatLng(15.9801, 120.7000), //st maria
                        new LatLng(16.0044, 120.6545), //asingan
                        new LatLng(15.9758, 120.5707), //urdaneta
                        new LatLng(15.9806,   120.5606)) //ucu
                .width(10)
                .color(Color.YELLOW));


    }
}