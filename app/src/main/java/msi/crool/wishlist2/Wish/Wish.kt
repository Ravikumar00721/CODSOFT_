package msi.crool.wishlist2.Wish

import android.icu.text.CaseMap.Title
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish_table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id:Long=0L,
    @ColumnInfo(name = "wish_title")
    val title: String="",
    @ColumnInfo(name="wish_desc")
    val description:String=""
)

object DummyWish{
   val  wishList= listOf(
       Wish(title = "Google Watch 2", description = "An Android Watch"),
       Wish(title = "Best", description = "An Android Developer"),
       Wish(title = "Google Watch 2", description = "An Android Watch"),
       Wish(title = "Google Watch 2", description = "An Android Watch")
   )
}
