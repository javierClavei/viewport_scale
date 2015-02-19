package viewport_scale;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class CDVViewportScale extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }
        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}

public class ViewportScale extends DroidGap
{       
    super.onCreate(savedInstanceState);
    super.init(); // Don't forget this, you'll get runtime error otherwise!

    // The following does the trick:
    super.appView.getSettings().setUseWideViewPort(true);
    super.appView.getSettings().setLoadWithOverviewMode(true);

    super.loadUrl("file:///android_asset/www/index.htm");
}
