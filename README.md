Documentation
-----------------------------------------------------------------------------

This application contains single activity (MainActivity) which always runs in foreground.
Whenever this activity is  destroyed or killed by system, it calls to Service which again launches the activity.
MainActivity is declared as "singleTask" in AndroidManifest.xml to follow singleton pattern for the Activity.
