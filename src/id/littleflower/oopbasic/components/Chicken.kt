package id.littleflower.oopbasic.components

class Chicken : Bird(), Domesticated {

    override fun voice(): String {
        return "kururuyuk ~"
    }

    override fun voraType(): VoraType {
        return VoraType.KARNIVORA
    }

    override fun canFly(): Boolean {
        return false
    }

    override fun touchedByHuman() {
        println("Even thought I was domesticated, I don't like when a human touch me! Go away!!")
    }

}