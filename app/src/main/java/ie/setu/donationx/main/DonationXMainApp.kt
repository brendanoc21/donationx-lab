package ie.setu.donationx.main

import android.app.Application
import timber.log.Timber

class DonationXMainApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        Timber.i("Starting DonationX Application")
    }
}
