package com.example.acme.activities;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0003J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u001dH\u0016J-\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 2\u000e\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%H\u0017\u00a2\u0006\u0002\u0010&J\b\u0010\'\u001a\u00020\u000fH\u0015J\b\u0010(\u001a\u00020\u001bH\u0002J\b\u0010)\u001a\u00020\u000fH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/example/acme/activities/GoogleMaps;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/maps/GoogleMap$OnMyLocationButtonClickListener;", "Lcom/google/android/gms/maps/GoogleMap$OnMyLocationClickListener;", "Lcom/google/android/gms/maps/GoogleMap$OnMapClickListener;", "Lcom/google/android/gms/maps/GoogleMap$OnMapLoadedCallback;", "()V", "address", "Landroid/location/Address;", "binding", "Lcom/example/acme/databinding/ActivityGoogleMapsBinding;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "createMapFragment", "", "enableLocation", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapClick", "p0", "Lcom/google/android/gms/maps/model/LatLng;", "onMapLoaded", "onMapReady", "googleMap", "onMyLocationButtonClick", "", "onMyLocationClick", "Landroid/location/Location;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResumeFragments", "permissionLocation", "requestLocPermission", "Companion", "app_debug"})
public final class GoogleMaps extends androidx.appcompat.app.AppCompatActivity implements com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener, com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener, com.google.android.gms.maps.GoogleMap.OnMapClickListener, com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback {
    private com.google.android.gms.maps.GoogleMap mMap;
    private com.example.acme.databinding.ActivityGoogleMapsBinding binding;
    private android.location.Address address;
    @org.jetbrains.annotations.NotNull
    public static final com.example.acme.activities.GoogleMaps.Companion Companion = null;
    public static final int codeLocation = 0;
    
    public GoogleMaps() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void createMapFragment() {
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
    @java.lang.Override
    public void onMapReady(@org.jetbrains.annotations.NotNull
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    private final boolean permissionLocation() {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void enableLocation() {
    }
    
    private final void requestLocPermission() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override
    protected void onResumeFragments() {
    }
    
    @java.lang.Override
    public boolean onMyLocationButtonClick() {
        return false;
    }
    
    @java.lang.Override
    public void onMyLocationClick(@org.jetbrains.annotations.NotNull
    android.location.Location p0) {
    }
    
    @java.lang.Override
    public void onMapClick(@org.jetbrains.annotations.NotNull
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @java.lang.Override
    public void onMapLoaded() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/acme/activities/GoogleMaps$Companion;", "", "()V", "codeLocation", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}