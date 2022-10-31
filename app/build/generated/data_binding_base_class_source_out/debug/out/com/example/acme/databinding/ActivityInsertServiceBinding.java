// Generated by view binder compiler. Do not edit!
package com.example.acme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.acme.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityInsertServiceBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final EditText city;

  @NonNull
  public final EditText country;

  @NonNull
  public final EditText dept;

  @NonNull
  public final EditText dispatchNote;

  @NonNull
  public final EditText fechaInsertar;

  @NonNull
  public final AppCompatButton insertarService;

  @NonNull
  public final LinearLayout mostrarDatos;

  @NonNull
  public final EditText name;

  @NonNull
  public final EditText postalCode;

  @NonNull
  public final EditText reasonCall;

  @NonNull
  public final EditText street;

  @NonNull
  public final EditText type;

  @NonNull
  public final EditText userPhone;

  private ActivityInsertServiceBinding(@NonNull NestedScrollView rootView, @NonNull EditText city,
      @NonNull EditText country, @NonNull EditText dept, @NonNull EditText dispatchNote,
      @NonNull EditText fechaInsertar, @NonNull AppCompatButton insertarService,
      @NonNull LinearLayout mostrarDatos, @NonNull EditText name, @NonNull EditText postalCode,
      @NonNull EditText reasonCall, @NonNull EditText street, @NonNull EditText type,
      @NonNull EditText userPhone) {
    this.rootView = rootView;
    this.city = city;
    this.country = country;
    this.dept = dept;
    this.dispatchNote = dispatchNote;
    this.fechaInsertar = fechaInsertar;
    this.insertarService = insertarService;
    this.mostrarDatos = mostrarDatos;
    this.name = name;
    this.postalCode = postalCode;
    this.reasonCall = reasonCall;
    this.street = street;
    this.type = type;
    this.userPhone = userPhone;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityInsertServiceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityInsertServiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_insert_service, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityInsertServiceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.city;
      EditText city = ViewBindings.findChildViewById(rootView, id);
      if (city == null) {
        break missingId;
      }

      id = R.id.country;
      EditText country = ViewBindings.findChildViewById(rootView, id);
      if (country == null) {
        break missingId;
      }

      id = R.id.dept;
      EditText dept = ViewBindings.findChildViewById(rootView, id);
      if (dept == null) {
        break missingId;
      }

      id = R.id.dispatchNote;
      EditText dispatchNote = ViewBindings.findChildViewById(rootView, id);
      if (dispatchNote == null) {
        break missingId;
      }

      id = R.id.fechaInsertar;
      EditText fechaInsertar = ViewBindings.findChildViewById(rootView, id);
      if (fechaInsertar == null) {
        break missingId;
      }

      id = R.id.insertarService;
      AppCompatButton insertarService = ViewBindings.findChildViewById(rootView, id);
      if (insertarService == null) {
        break missingId;
      }

      id = R.id.mostrarDatos;
      LinearLayout mostrarDatos = ViewBindings.findChildViewById(rootView, id);
      if (mostrarDatos == null) {
        break missingId;
      }

      id = R.id.name;
      EditText name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.postalCode;
      EditText postalCode = ViewBindings.findChildViewById(rootView, id);
      if (postalCode == null) {
        break missingId;
      }

      id = R.id.reasonCall;
      EditText reasonCall = ViewBindings.findChildViewById(rootView, id);
      if (reasonCall == null) {
        break missingId;
      }

      id = R.id.street;
      EditText street = ViewBindings.findChildViewById(rootView, id);
      if (street == null) {
        break missingId;
      }

      id = R.id.type;
      EditText type = ViewBindings.findChildViewById(rootView, id);
      if (type == null) {
        break missingId;
      }

      id = R.id.userPhone;
      EditText userPhone = ViewBindings.findChildViewById(rootView, id);
      if (userPhone == null) {
        break missingId;
      }

      return new ActivityInsertServiceBinding((NestedScrollView) rootView, city, country, dept,
          dispatchNote, fechaInsertar, insertarService, mostrarDatos, name, postalCode, reasonCall,
          street, type, userPhone);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
