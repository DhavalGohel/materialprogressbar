package com.dhaval.materialprogressbar;

import android.app.Dialog;
import android.content.Context;

/**
 * Created by sphere67 on 13/4/17.
 */

public class CustomProgressDialog  extends Dialog{

    Context mContext;
    CustomProgressDialog dialog;
    MaterialProgressBar progress1;

    public CustomProgressDialog(Context context) {
        super(context);
        this.mContext=context;
    }

    public CustomProgressDialog(Context context, int theme) {
        super(context, theme);
    }

    public CustomProgressDialog show(CharSequence message) {

        dialog = new CustomProgressDialog (mContext, srtpl.com.materialprogressbar.R.style.ProgressDialog);
        dialog.setContentView(srtpl.com.materialprogressbar.R.layout.progress_bar);

        progress1 = (MaterialProgressBar) dialog.findViewById (srtpl.com.materialprogressbar.R.id.progress1);


        progress1.setColorSchemeResources(srtpl.com.materialprogressbar.R.color.red, srtpl.com.materialprogressbar.R.color.green, srtpl.com.materialprogressbar.R.color.blue, srtpl.com.materialprogressbar.R.color.orange);
        dialog.setCancelable(true);
        if(dialog!= null) {
            dialog.show ();
        }
        return dialog;
    }
    public CustomProgressDialog show(CharSequence message,boolean cancelable,int... resourceId) {

        dialog = new CustomProgressDialog (mContext, srtpl.com.materialprogressbar.R.style.ProgressDialog);
        dialog.setContentView(srtpl.com.materialprogressbar.R.layout.progress_bar);

        progress1 = (MaterialProgressBar) dialog.findViewById (srtpl.com.materialprogressbar.R.id.progress1);

        if(resourceId.length > 0){
            progress1.setColorSchemeResources(resourceId);
        }else {
            progress1.setColorSchemeResources(srtpl.com.materialprogressbar.R.color.red, srtpl.com.materialprogressbar.R.color.green, srtpl.com.materialprogressbar.R.color.blue, srtpl.com.materialprogressbar.R.color.orange);
        }

        dialog.setCancelable(cancelable);
        if(dialog!= null) {
            dialog.show ();
        }
        return dialog;
    }
    public CustomProgressDialog dismiss(CharSequence message) {
        if(dialog!=null) {
            dialog.dismiss();
        }

        return dialog;

    }
}
