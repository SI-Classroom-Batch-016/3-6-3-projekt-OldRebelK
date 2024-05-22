package com.example.arcadeshootemuphystoria.data

import com.example.arcadeshootemuphystoria.R

object Ashdatasource {

    val arcade: List<AshAutomatData> = listOf(
        AshAutomatData(R.drawable.axelayicon,R.drawable.axelaylogo,R.drawable.axelayarcscreen),
        AshAutomatData(R.drawable.arrowheadicon,R.drawable.rtypelogo,R.drawable.rtypearcscreen),
        AshAutomatData(R.drawable.vicvipericon,R.drawable.gradiuslogo,R.drawable.gradiusarcscreen),
        AshAutomatData(R.drawable.silverhawkicon,R.drawable.dariuslogo,R.drawable.dariusarcscreen)
    )

    val info: List<AshInfoFragData> = listOf(
        AshInfoFragData("Axelay",R.drawable.axelay1,R.drawable.axelay2),
        AshInfoFragData("R-Type",R.drawable.rtype1,R.drawable.rtype2),
        AshInfoFragData("Gradius",R.drawable.gradius1,R.drawable.gradius2),
        AshInfoFragData("Darius",R.drawable.darius1,R.drawable.darius2)
    )

    val tipps: List<AshTippsData> = listOf(
        AshTippsData("Axelay Tipps"),
        AshTippsData("R-Type Tipps"),
        AshTippsData("Gradius Tipps"),
        AshTippsData("Darius Tipps")
    )
}