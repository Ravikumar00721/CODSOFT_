package msi.crool.wishlist2

import android.content.Context
import androidx.room.Room
import msi.crool.wishlist2.Wish.WishDataBase
import msi.crool.wishlist2.Wish.WishRepository

object graph {
    lateinit var dataBase: WishDataBase

    val wishRepository by lazy {
        WishRepository(wishDao = dataBase.wishDao())
    }

    fun provide(context: Context)
    {
        dataBase = Room.databaseBuilder(context, WishDataBase::class.java,"wishlist.db").build()
    }
}