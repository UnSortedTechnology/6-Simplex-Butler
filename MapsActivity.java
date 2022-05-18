package com.example.map;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.map.databinding.ActivityMapsBinding;

import java.util.Objects;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;

    private GoogleMap mMap;
    private ActivityMapsBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        drawerLayout = findViewById(R.id.my_drawable);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,
                drawerLayout, R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        //display the left hand side bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        //selected item perform the task
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {

            switch (item.getItemId()) {
                case R.id.nagpur:
//                    if (item.isChecked()) item.setChecked(false);
//                    else item.setChecked(true);
                    onClickedCityNagpur((MenuItem) this);
                    return true;
                case R.id.mumbai:
//                    if (item.isChecked()) item.setChecked(false);
//                    else item.setChecked(true);
                    onClickedCityMumbai((MenuItem) this);
                    return true;
                case R.id.delhi:
//                    if (item.isChecked()) item.setChecked(false);
//                    else item.setChecked(true);
                    onClickedCityDelhi((MenuItem) this);
                    return true;
                case R.id.hyderabad:
//                    if (item.isChecked()) item.setChecked(false);
//                    else item.setChecked(true);
                    onClickedCityHyderabad((MenuItem) this);
                    return true;
                case R.id.indore:
//                    if (item.isChecked()) item.setChecked(false);
//                    else item.setChecked(true);
                    onClickedCityIndore((MenuItem) this);
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }
        return super.onOptionsItemSelected(item);
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




    }

    //funcations of button

    public void onClickedCityNagpur(MenuItem item) {

        // Add a marker in Sydney and move the camera
        if(item.isChecked()){
            mMap.clear();
            item.setChecked(false);
        }else{
            LatLng nagpur = new LatLng( 21.146633, 79.088860);
            mMap.addMarker(new MarkerOptions()
                    .position(nagpur)
                    .draggable(true)
                    .title("Nagpur"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(nagpur));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(11.0f));
            mMap.setOnMarkerClickListener(marker -> {
                marker.remove();
                return true;
            });
            item.setChecked(true);
        }



    }



    public void onClickedCityMumbai(MenuItem item) {

        // Add a marker in Sydney and move the camera
        if(item.isChecked()){
            mMap.clear();
            item.setChecked(false);
        }else {
            LatLng mumbai = new LatLng(19.076090, 72.877426);
            mMap.addMarker(new MarkerOptions()
                    .position(mumbai)
                    .draggable(true)
                    .title("Mumbai"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(mumbai));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(11.0f));
            mMap.setOnMarkerClickListener(marker -> {
                marker.remove();
                return true;
            });
            item.setChecked(true);
        }
    }


    public void onClickedCityDelhi(MenuItem item) {

        // Add a marker in Sydney and move the camera
        if(item.isChecked()){
            mMap.clear();
            item.setChecked(false);
        }else {
            LatLng delhi = new LatLng(28.644800, 77.216721);
            mMap.addMarker(new MarkerOptions()
                    .position(delhi)
                    .draggable(true)
                    .title("Delhi"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(delhi));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(11.0f));
            mMap.setOnMarkerClickListener(marker -> {
                marker.remove();
                return true;
            });
            item.setChecked(true);
        }
    }




    public void onClickedCityHyderabad(MenuItem item) {

        // Add a marker in Sydney and move the camera
        if(item.isChecked()){
            mMap.clear();
            item.setChecked(false);
        }else {
            LatLng hyderabad = new LatLng(17.387140, 78.491684);
            mMap.addMarker(new MarkerOptions()
                    .position(hyderabad)
                    .draggable(true)
                    .title("hyderabad"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(hyderabad));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(11.0f));
            mMap.setOnMarkerClickListener(marker -> {
                marker.remove();
                return true;
            });
            item.setChecked(true);
        }

    }



    public void onClickedCityIndore(MenuItem item) {

        // Add a marker in Sydney and move the camera
        if(item.isChecked()){
            mMap.clear();
            item.setChecked(false);
        }else {
            LatLng indore = new LatLng(22.719568, 75.857727);
            mMap.addMarker(new MarkerOptions()
                    .position(indore)
                    .draggable(true)
                    .title("Indore"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(indore));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(11.0f));
            mMap.setOnMarkerClickListener(marker -> {
                marker.remove();
                return true;
            });
            item.setChecked(true);
        }
    }




    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
