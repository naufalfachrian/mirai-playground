package id.littleflower.oopbasic.components

class Dog : Canis(), Domesticated {

    override fun voice(): String {
        return "guk guk guk ~"
    }

    override fun touchedByHuman() {
        println("Hello my friend! I'll always be your best friend!")
    }

}