package com.deeksha.signinandout;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        float zoomLevel = 10.0f;
        LatLng l1 = new LatLng(22.229670994897383, 114.25601249417187);
        mMap.addMarker(new MarkerOptions().position(l1).title("Shek O Lovers Bridge"));
        LatLng l2 = new LatLng(22.326303633273714, 114.02060835127995);
        mMap.addMarker(new MarkerOptions().position(l2).title("Yam O"));
        LatLng l3 = new LatLng(22.389004175302464, 113.9200302952538);
        mMap.addMarker(new MarkerOptions().position(l3).title("Lung Kwu Tan"));
        LatLng l4 = new LatLng(22.306591839658413, 114.21267040780333);
        mMap.addMarker(new MarkerOptions().position(l4).title("Kai Tak Cruise Terminal"));
        LatLng l5 = new LatLng(22.455452057432357, 114.20996598978205);
        mMap.addMarker(new MarkerOptions().position(l5).title("Sam Mun Tsai"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(l2, zoomLevel));


    }
}