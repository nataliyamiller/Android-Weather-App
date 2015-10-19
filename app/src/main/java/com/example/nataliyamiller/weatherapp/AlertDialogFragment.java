package com.example.nataliyamiller.weatherapp;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.app.AlertDialog;

/**
 * Created by nataliyamiller on 10/19/15.
 */
public class AlertDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                        .setTitle(context.getString(R.string.error_title))
                        .setMessage(context.getString(R.string.error_message))
                        .setPositiveButton(R.string.error_ok_button_text, null);
        AlertDialog dialog = builder.create();
        return dialog;
    }
}
