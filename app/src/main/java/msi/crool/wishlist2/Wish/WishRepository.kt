package msi.crool.wishlist2.Wish

import kotlinx.coroutines.flow.Flow

class WishRepository(private val wishDao:WishDAO) {
    suspend fun addWish(wish:Wish)
    {
        wishDao.addWish(wish)
    }
    fun getWishes(): Flow<List<Wish>> = wishDao.getAllWishes()

    fun getWishByID(id:Long) : Flow<Wish>
    {
        return  wishDao.getAWish(id)
    }

    suspend fun updateWish(wish:Wish)
    {
        wishDao.updateWish(wish)
    }

    suspend fun deleteWish(wish: Wish)
    {
        wishDao.deleteWish(wish)
    }
}