package com.android.havid.binar_ch5_challenge_suit

class GameRules (
    private val hasilGame: HasilPermainan,
    private val player1: String,
    private val player2: String
    ) : StatusGame{
        override fun statusGame(pilihan1: String, pilihan2: String){
            if (pilihan1 == pilihan2){
                hasilGame.hasilPermainan("Seri Boss Main Lagi")
            } else if (pilihan1 == "BATU" && pilihan2 == "GUNTING"
                || pilihan1 == "GUNTING" && pilihan2 == "KERTAS"
                || pilihan1 == "KERTAS" && pilihan2 == "BATU"){
                hasilGame.hasilPermainan("$player1 \n Selamat Anda Menang")
            } else {
                hasilGame.hasilPermainan("$player2 \n Selamat Anda Menang")
            }
        }
    }