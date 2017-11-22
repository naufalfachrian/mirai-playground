package id.littleflower.oopbasic.components

class Cockatoo : Bird(), Domesticated {

    private var somethingToSay: String = ""

    override fun voice(): String {
        return "kakatua kakatua ~ " + somethingToSay
    }

    override fun voraType(): VoraType {
        return VoraType.HERBIVORA
    }

    override fun touchedByHuman() {
        println("I can only say, \"kakatua, kakatua, feed me please.\"")
    }

    fun say(somethingToSay: String) {
        this.somethingToSay = somethingToSay + " ~"
        println(this.voice())
    }

}