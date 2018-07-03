package com.matrixgz.cordova.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class Encrypt extends CordovaPlugin {

    final String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCKDrP16p/HqsQsbKdJGuBezay26uxqhroqdncC5Tb9oY69iZoNPqs+U8Y5vO8UJkviPyHknjmPU7JGcwigRbFWia2K9iuNfmWucA3du3hPuIexSjZ6mGIhzPYkxEAgoubTGy6DZNNdMxws178zXdH6AQWJhY5eAvZWgDpYAY1BvwIDAQAB";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("getPublicKey")) {
            this.getPublicKey(callbackContext);
            return true;
        }
        return false;
    }

    private void getPublicKey(CallbackContext callbackContext) {
        callbackContext.success(this.publicKey);
    }
}
