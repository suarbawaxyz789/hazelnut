package com.example.hazelnut.ui.features.ninjas.driverapponly

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.ninjavan.akira.designsystem.compose.foundation.AkiraTheme
import co.ninjavan.akira.designsystem.compose.foundation.AkiraTheme.colors
import co.ninjavan.akira.designsystem.compose.foundation.AkiraTheme.spacings
import com.example.hazelnut.R
import com.example.hazelnut.ui.features.ninjas.bespoke.BarValue
import com.example.hazelnut.ui.features.ninjas.bespoke.MultiColorProgressBar


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}

@Composable
fun MyApp() {
    Scaffold(
        topBar = {
            AppBar2()
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
                verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center
            ) {
                Text(text = "Hello, Jetpack Compose!")
            }
        }
    )
}

@Composable
fun AppBar2() {
    Box(modifier = Modifier.background(color = colors.gray9)) {
        Column(
            modifier = Modifier
                .padding(horizontal = spacings.spacingXxxs)
        ) {
            UpperAppBar()
            Spacer(modifier = Modifier.height(spacings.spacingS))
            LowerAppBar()
            Spacer(modifier = Modifier.height(spacings.spacingXxs))
        }
    }
}

@Composable
fun LowerAppBar() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
    ) {
        MultiColorProgressBar(
            progresses = arrayListOf(
                BarValue(
                    colors.red3,
                    progress = 0.1f,
                    "15 successful waypoints",
                ),
                BarValue(
                    colors.green3,
                    progress = 0.1f, "54 pending waypoints",
                ),
                BarValue(
                    colors.orange3,
                    progress = 0.1f, "1 partial waypoints",
                ),
                BarValue(
                    colors.gray3,
                    progress = 0.2f, "short 1",
                ),
                BarValue(
                    colors.blue3,
                    progress = 0.3f, "short",
                ),
            )
        )
    }
}

@Composable
fun UpperAppBar() {
    val context = LocalContext.current
    Column {
        Row {
            IconButton(onClick = {
                Toast.makeText(context, "Navigation icon clicked", Toast.LENGTH_SHORT).show()
            }) {
                Icon(
                    painter = painterResource(id = R.drawable.expanable_arrow_up),
                    contentDescription = null,
                    modifier = Modifier.rotate(270f)
                )
            }
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Route",
                    style = AkiraTheme.typography.heading5.copy(
                        color = colors.gray1
                    ),
                    maxLines = 1,
                )
                Text(
                    text = "Route ID 132434",
                    style = AkiraTheme.typography.body2.copy(
                        color = colors.gray3
                    ),
                    maxLines = 1,
                )
            }
            Row {
                IconButton(onClick = {
                    Toast.makeText(context, "Navigation icon clicked", Toast.LENGTH_SHORT).show()
                }) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_l_sync),
                        contentDescription = null,
                        modifier = Modifier.rotate(270f)
                    )
                }
                IconButton(onClick = {
                    Toast.makeText(context, "Navigation icon clicked", Toast.LENGTH_SHORT).show()
                }) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_m_times),
                        contentDescription = null,
                        modifier = Modifier.rotate(270f)
                    )
                }
            }
        }
    }
}