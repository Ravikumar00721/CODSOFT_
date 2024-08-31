package msi.crool.wishlist2

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import msi.crool.wishlist2.Wish.Wish
import msi.crool.wishlist2.Wish.WishRepository

class WishViewModel(
    private val wishRepository: WishRepository=graph.wishRepository
):ViewModel() {
    var wishTitleState by mutableStateOf("")
    var wishDescriptionState by mutableStateOf("")

    fun onWishTitleChanged(newString: String)
    {
        wishTitleState= newString
    }
    fun onWishDescriptionChanged(newString: String)
    {
        wishDescriptionState= newString
    }

     lateinit var getAllWishes : Flow<List<Wish>>

    init {
        viewModelScope.launch {
            getAllWishes=wishRepository.getWishes()
        }
    }

    fun addWish(wish:Wish)
    {
        viewModelScope.launch(Dispatchers.IO) {
            wishRepository.addWish(wish=wish)
        }
    }

    fun updateWish(wish:Wish)
    {
        viewModelScope.launch(Dispatchers.IO) {
            wishRepository.updateWish(wish=wish)
        }
    }
    fun deleteWish(wish:Wish)
    {
        viewModelScope.launch(Dispatchers.IO) {
            wishRepository.deleteWish(wish=wish)
        }
    }
    fun getWishID(id:Long) :Flow<Wish>
    {
        return wishRepository.getWishByID(id)
    }
}