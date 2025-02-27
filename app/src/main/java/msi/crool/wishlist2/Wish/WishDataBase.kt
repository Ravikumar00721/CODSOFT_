package msi.crool.wishlist2.Wish

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Wish::class],
    version=1,
    exportSchema = false
)

abstract class WishDataBase:RoomDatabase() {
    abstract fun wishDao():WishDAO
}