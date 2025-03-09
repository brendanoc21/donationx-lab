package ie.setu.donationx.ui.screens.donate

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import ie.setu.donationx.data.DonationModel
import ie.setu.donationx.data.repository.RoomRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DonateViewModel @Inject
constructor(private val repository: RoomRepository) : ViewModel() {

    fun insert(donations: DonationModel)
            = viewModelScope.launch {
        repository.insert(donations)
    }
}
