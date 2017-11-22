package id.littleflower.oopbasic.components

class Cat : Felidae(), Domesticated {

    override fun voice(): String {
        return "nyan <3"
    }

    override fun touchedByHuman() {
        println("Aahhhh, I always love to be touched by human .... I'll always follow you anywhere you go!")
    }

}