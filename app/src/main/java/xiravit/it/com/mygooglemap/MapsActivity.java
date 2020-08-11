package xiravit.it.com.mygooglemap;

import android.support.v4.app.FragmentActivity;
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

        // กำหนด lat long
        LatLng rmu = new LatLng(16.200897, 103.272644);
        LatLng seamthai = new LatLng(16.202024, 103.277021);

        //rmu
        mMap.addMarker(new MarkerOptions().position(rmu).title("สนาม3"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(rmu));

        // ซูม google map
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(rmu, 15));


        //seamthai
        mMap.addMarker(new MarkerOptions().position(seamthai).title("เสริมไทย คอมเพลค"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(seamthai));

        // ซูม google map
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(seamthai, 15));

        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);














    }
}
