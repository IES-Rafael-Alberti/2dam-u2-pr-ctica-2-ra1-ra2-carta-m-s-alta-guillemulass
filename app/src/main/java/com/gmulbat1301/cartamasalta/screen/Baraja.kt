package com.gmulbat1301.cartamasalta.screen

class Baraja(listaCartas : ArrayList<Carta>){

    companion object{

        lateinit var Carta : Carta
        var baraja = arrayListOf<Carta>()
        var cardCounter = 1


        fun crearBaraja(){
            for (i in Naipes.values()){
                for (j in Palos.values()){
                    if (i == Naipes.As){
                        baraja.add(Carta(i,j,1,11,cardCounter))
                    }
                    else{
                        baraja.add(Carta(i,j,i.ordinal,i.ordinal,cardCounter))
                    }
                    cardCounter ++
                }
            }
        }

        fun barajar(){
            baraja.shuffle()
        }

        fun dameCarta() : Carta{
            if (baraja.isEmpty()){
                Carta = baraja.last()
                baraja.remove(baraja.last())
                return Carta
            }
            return Carta
        }
    }

}