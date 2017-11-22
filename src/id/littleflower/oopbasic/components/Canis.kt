package id.littleflower.oopbasic.components

abstract class Canis : Mamalia() {

    override fun voraType(): VoraType {
        return VoraType.KARNIVORA
    }

}