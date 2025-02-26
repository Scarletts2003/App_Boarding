package com.example.boardingapp.viewModel

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.boardingapp.R
import com.example.boardingapp.data.PageData
import com.example.boardingapp.dataStore.StoreBoarding
import com.example.boardingapp.onBoardViews.OnBoardingPager
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState


@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainViewBoarding(navController: NavController, store:StoreBoarding){
    val items = ArrayList<PageData>()

    items.add(
        PageData(
            R.raw.page1,
            "Bienvenidos al himalaya",
            "Bienvenidos pero no por mucho tiempo"

        )
    )

    items.add(
        PageData(
            R.raw.page2,
            "Uso de onBoarding",
            "Esta es la segunda página. Soy la barbie Guía :))"
        )
    )

    items.add(
        PageData(
            R.raw.page4,
            "Tercera pagina",
            "Holis:)"
        )
    )

    items.add(
        PageData(
            R.raw.page3,
            "Final del Boarding",
            "Esta es la ultima página. Adiós tonotos no regresen"
        )
    )



    val pagerState= rememberPagerState(
        pageCount = items.size,
        initialOffscreenLimit = 2,
        infiniteLoop = false,
        initialPage = 0
    )

    OnBoardingPager(item = items, pagerState = pagerState, modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(Color.White),
        navController,
        store
    )
}
