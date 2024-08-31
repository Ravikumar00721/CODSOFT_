package msi.crool.wishlist2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBarView(
    title:String,
    onBackClicked:()->Unit={}
)
{
    val navigationIcon:(@Composable () -> Unit)?={
        if (!title.contains("WishList"))
        {
            IconButton(onClick = {onBackClicked()}) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription =null,
                    tint= colorResource(
                    id = R.color.white
                ) )
            }
        }
    }

    if (navigationIcon != null) {
            TopAppBar(
                title = {
                    Text(
                        text = title, color = colorResource(id = R.color.white),
                        modifier = Modifier
                            .padding(start = 4.dp)
                            .heightIn(24.dp)
                    )
                },
                navigationIcon = navigationIcon,
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.red)
                ),
                modifier = Modifier.shadow(3.dp)
            )
    }
}
