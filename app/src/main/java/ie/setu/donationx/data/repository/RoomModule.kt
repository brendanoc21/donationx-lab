package ie.setu.donationx.data.repository

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ie.setu.donationx.data.room.AppDatabase
import ie.setu.donationx.data.room.DonationDAO
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {
    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context):
            AppDatabase =
        Room.databaseBuilder(context, AppDatabase::class.java, "donation_database")
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    fun provideDonationDAO(appDatabase: AppDatabase):
            DonationDAO = appDatabase.getDonationDAO()

    @Provides
    fun provideRoomRepository(donationDAO: DonationDAO):
            RoomRepository = RoomRepository(donationDAO)
}
