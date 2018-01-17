cordova.define('cordova/plugin_list', function(require, exports, module) {
module.exports = [
    {
        "id": "cordova-plugin-firebase-messaging.FirebaseMessaging",
        "file": "plugins/cordova-plugin-firebase-messaging/www/FirebaseMessaging.js",
        "pluginId": "cordova-plugin-firebase-messaging",
        "merges": [
            "cordova.plugins.firebase.messaging"
        ]
    }
];
module.exports.metadata = 
// TOP OF METADATA
{
    "cordova-plugin-whitelist": "1.3.2",
    "cordova-plugin-cocoapod-support": "1.3.0",
    "cordova-plugin-firebase-hooks": "0.9.6",
    "cordova-plugin-firebase-messaging": "0.9.0"
};
// BOTTOM OF METADATA
});