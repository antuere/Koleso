package com.makeevrserg.koleso.feature.koleso.root.ui

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.makeevrserg.koleso.feature.koleso.participants.ui.ParticipantsContent
import com.makeevrserg.koleso.feature.koleso.root.presentation.DefaultRootKolesoComponent
import com.makeevrserg.koleso.feature.koleso.wheel.ui.WheelContent
import com.makeevrserg.koleso.feature.koleso.wheel.ui.component.WheelExtendedFloatingActionButton
import com.makeevrserg.koleso.feature.koleso.winner.ui.WinnerContent

@Composable
fun KolesoScreen(
    rootKolesoComponent: DefaultRootKolesoComponent
) {
    Scaffold(
        floatingActionButton = {
            WheelExtendedFloatingActionButton(rootKolesoComponent.wheelComponent)
        }
    ) {
        Row {
            ParticipantsContent(rootKolesoComponent.participantsComponent)
            Column(
                modifier = Modifier.fillMaxSize().animateContentSize(),
            ) {
                WheelContent(rootKolesoComponent.wheelComponent, rootKolesoComponent.participantsComponent)
                WinnerContent(rootKolesoComponent.winnerComponent)
            }
        }
    }

}