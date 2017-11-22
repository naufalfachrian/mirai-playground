package id.littleflower.oopbasic.components

class Eagle : Bird() {

    override fun voice(): String {
        return "kuuuukkk kuuuuuuuukkkkk"
    }

    override fun voraType(): VoraType {
        return VoraType.KARNIVORA
    }

}