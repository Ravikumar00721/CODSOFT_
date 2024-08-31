package msi.crool.wishlist2

import android.app.Application

class WishListApp:Application() {
    override fun onCreate() {
        super.onCreate()
        graph.provide(this)
    }
}