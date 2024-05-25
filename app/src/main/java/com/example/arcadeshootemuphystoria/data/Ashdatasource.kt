package com.example.arcadeshootemuphystoria.data

import com.example.arcadeshootemuphystoria.R

object Ashdatasource {

    val arcade: List<AshAutomatData> = listOf(
        AshAutomatData(R.drawable.axelayicon,R.drawable.axelaylogo,R.drawable.axelayarcscreen,AshkategorieData(R.drawable.axelayicon,R.drawable.axelaygif),AshInfoFragData("Axelay wurde 1992 von Konami entwickelt und für die SuperNintendo Rausgebracht." +
                "Es ist sowohl ein Horizontal als auch Vertikal Shoot em up  und einer der ersten das damals Mode 7 verwendet hat." +
                "Mit einen recht einzigartigen  Soundtrack und einen innovativen Waffensystem wurde Axelay einer der beliebtererin titel auf der SNES.",R.drawable.axelay1,R.drawable.axelay2),AshTippsData(R.drawable.axelayicon,"Axelay Tipps")),
        AshAutomatData(R.drawable.arrowheadicon,R.drawable.rtypelogo,R.drawable.rtypearcscreen,AshkategorieData(R.drawable.arrowheadicon,R.drawable.rtypegif),AshInfoFragData("R-Type erschien zum erstenmal 1987 und wurde von Irem entwickelt." +
                "Die Spielereihe war insbesonders für das Force System bekannt das es den spieler ermöglichte eine seperate einheit zu steuern." +
                "R-Type zeichnet sich auch daran aus das es eine eher Düsteren ton hat. " +
                "Der aktuell letzte teil R-Type final 2 bietet den spielern über 100 schiffe an mit den man die Bydos Bekämpfen kann. ",R.drawable.rtype1,R.drawable.rtype2),AshTippsData(R.drawable.arrowheadicon,"R-Type Tipps")),
        AshAutomatData(R.drawable.vicvipericon,R.drawable.gradiuslogo,R.drawable.gradiusarcscreen,AshkategorieData(R.drawable.vicvipericon,R.drawable.gradiusgif),AshInfoFragData("Gradius wurde 1985 von Konami entwickelt." +
                "Es zeichnet sich durch sein einzigartiges Power Up System aus das es den spieler ermöglicht frei zu entscheiden was für upgrades er gerne hätte." +
                "Die Schiffe & Gegner von Gradius wurden sogar als Spiele Karten für das TCG Yu-Gi-Oh rausgebracht." +
                "Der Aktuelle letzte teil Gradius 5 kam damals für die Playstation 2 raus und bis heute gab es leider keine fortsetzung.",R.drawable.gradius1,R.drawable.gradius2),AshTippsData(R.drawable.vicvipericon,"Gradius Tipps")),
        AshAutomatData(R.drawable.silverhawkicon,R.drawable.dariuslogo,R.drawable.dariusarcscreen,AshkategorieData(R.drawable.silverhawkicon,R.drawable.dariusgif),AshInfoFragData("Darius kam 1986 zum erstenmal ans tageslicht und wurde von Taito entwickelt." +
                "Berühmt wurde die Serie vor allem durch die Gegner, die albtraumhaften Mutationen von Fischen und anderen Meerestieren ähneln" +
                "Die Spiele reihe wurde auch als Rivale zu der Gradius serie angesehen da sie sich an vielen stellen Ähnelten." +
                "Der Letzte teil von Darius war Dariusburst Chronicle Saviours das 2015 für mehrere Konsolen und den Arcades erschien.",R.drawable.darius1,R.drawable.darius2),AshTippsData(R.drawable.silverhawkicon,"Darius Tipps"))
    )

    val info: List<AshInfoFragData> = listOf(
        AshInfoFragData("Axelay nd einen innovativen Waffensystem wurde Axelay einer der beliebtererin titel auf der SNES.",R.drawable.axelay1,R.drawable.axelay2),
        AshInfoFragData("R-Type erschien zum erstenmal 1987 und wurde von Irem entwickelt." +
                "Die Spielereihe war insbesonders für das Force System bekannt das es den spieler ermöglichte eine seperate einheit zu steuern." +
                "R-Type zeichnet sich auch daran aus das es eine eher Düsteren ton hat. " +
                "Der aktuell letzte teil R-Type final 2 bietet den spielern über 100 schiffe an mit den man die Bydos Bekämpfen kann. ",R.drawable.rtype1,R.drawable.rtype2),
        AshInfoFragData("Gradius wurde 1985 von Konami entwickelt." +
                "Es zeichnet sich durch sein einzigartiges Power Up System aus das es den spieler ermöglicht frei zu entscheiden was für upgrades er gerne hätte." +
                "Die Schiffe & Gegner von Gradius wurden sogar als Spiele Karten für das TCG Yu-Gi-Oh rausgebracht." +
                "Der Aktuelle letzte teil Gradius 5 kam damals für die Playstation 2 raus und bis heute gab es leider keine fortsetzung.",R.drawable.gradius1,R.drawable.gradius2),
        AshInfoFragData("Darius kam 1986 zum erstenmal ans tageslicht und wurde von Taito entwickelt." +
                "Berühmt wurde die Serie vor allem durch die Gegner, die albtraumhaften Mutationen von Fischen und anderen Meerestieren ähneln" +
                "Die Spiele reihe wurde auch als Rivale zu der Gradius serie angesehen da sie sich an vielen stellen Ähnelten." +
                "Der Letzte teil von Darius war Dariusburst Chronicle Saviours das 2015 für mehrere Konsolen und den Arcades erschien.",R.drawable.darius1,R.drawable.darius2)
    )

    val tipps: List<AshTippsData> = listOf(
        AshTippsData(R.drawable.axelayicon,"Axelay Tipps"),
        AshTippsData(R.drawable.arrowheadicon,"R-Type Tipps"),
        AshTippsData(R.drawable.vicvipericon,"Gradius Tipps"),
        AshTippsData(R.drawable.silverhawkicon,"Darius Tipps")
    )

    val kategorie: List<AshkategorieData> = listOf(
        AshkategorieData(R.drawable.axelayicon,R.drawable.axelaygif),
        AshkategorieData(R.drawable.arrowheadicon,R.drawable.rtypegif),
        AshkategorieData(R.drawable.vicvipericon,R.drawable.gradiusgif),
        AshkategorieData(R.drawable.silverhawkicon,R.drawable.dariusgif)
    )
}