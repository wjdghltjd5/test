package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;

import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapPolyline;
import net.daum.mf.map.api.MapView;

public class MainActivity extends AppCompatActivity {

    private MapView mapView;
    private ViewGroup mapViewContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mapView = new MapView(this);
        mapViewContainer = (ViewGroup) findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);

        mapView.setCurrentLocationTrackingMode(MapView.CurrentLocationTrackingMode.TrackingModeOnWithHeading);

        MapPOIItem marker = new MapPOIItem();

        MapPoint mapPoint = MapPoint.mapPointWithGeoCoord(37.44601, 127.17393);
        marker.setItemName("황송공원");
        marker.setTag(0);
        marker.setMapPoint(mapPoint);
        marker.setMarkerType(MapPOIItem.MarkerType.BluePin);
        marker.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin);

        mapView.addPOIItem(marker);


        MapPolyline polyline = new MapPolyline();
        polyline.setLineColor(Color.argb(255, 255, 51, 0));

        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.44448, 127.17307));
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.44592, 127.17474));
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.44569, 127.17511));
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.44569, 127.17585));
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.44551, 127.17586));
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.44526, 127.17614));
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.44533, 127.17650));
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.44561, 127.17675));
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.44583, 127.17670));
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.44591, 127.17647));
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.44620, 127.17629));
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.44569, 127.17585));
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.44569, 127.17511));
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.44592, 127.17474));
        polyline.addPoint(MapPoint.mapPointWithGeoCoord(37.44448, 127.17307));

        mapView.addPolyline(polyline);
    }
}