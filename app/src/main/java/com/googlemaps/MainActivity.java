package com.googlemaps;

import android.os.Bundle;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtiene el SupportMapFragment y notifica cuando el mapa está listo para ser utilizado.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Habilita los controles de zoom
        mMap.getUiSettings().setZoomControlsEnabled(true);
        // Habilita los gestos de rotación
        mMap.getUiSettings().setRotateGesturesEnabled(true);

        // Configura la cámara en una posición específica y con un zoom
        LatLng location = new LatLng(-34, 151); // Latitud y Longitud de ejemplo
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 10));
    }
}