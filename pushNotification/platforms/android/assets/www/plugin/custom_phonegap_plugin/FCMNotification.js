window.cordova.plugins.firebase.messaging.onMessage(function(payload) {
    console.log("New FCM message: ", payload);
    cordova.exec(succfun, failfun, "FirebaseMessagingPlugin", "subscribe", param);
});

window.cordova.plugins.firebase.messaging.onTokenRefresh(function(token) {
    console.log("Got device token: ", token);
});
