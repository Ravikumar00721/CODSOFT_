package msi.crool.wishlist2.Wish

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WishDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract  fun addWish(wishEntity:Wish)

    @Query("Select *From 'wish_table'")
    abstract fun getAllWishes(): Flow<List<Wish>>

    @Update
    abstract  fun updateWish(wishEntity: Wish)

    @Delete
    abstract fun deleteWish(wishEntity: Wish)

    @Query("Select *From 'wish_table' where id=:id")
    abstract fun getAWish(id:Long):Flow<Wish>
}