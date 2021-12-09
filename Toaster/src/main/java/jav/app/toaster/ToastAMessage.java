package jav.app.toaster;

import android.content.Context;
import android.widget.Toast;

public class ToastAMessage {
    public static void s(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();
    }

    public static int sum(Context context , int a, int b){
        return a+b;
    }
}
