package ie.setu.donationx.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ie.setu.donationx.data.DonationModel
import ie.setu.donationx.ui.screens.ScreenAbout
import ie.setu.donationx.ui.screens.ScreenDonate
import ie.setu.donationx.ui.screens.ScreenReport

@Composable
fun NavHostProvider(
    modifier: Modifier,
    navController: NavHostController,
    paddingValues: PaddingValues,
    donations: SnapshotStateList<DonationModel>
) {
    NavHost(
        navController = navController,
        startDestination = Report.route,
        modifier = Modifier.padding(paddingValues = paddingValues)) {

        composable(route = Donate.route) {
            //call our 'Donate' Screen Here
            ScreenDonate(modifier = modifier,donations = donations)
        }
        composable(route = Report.route) {
            //call our 'Report' Screen Here
            ScreenReport(modifier = modifier, donations = donations)
        }
        composable(route = About.route) {
            //call our 'About' Screen Here
            ScreenAbout(modifier = modifier)
        }
    }
}
