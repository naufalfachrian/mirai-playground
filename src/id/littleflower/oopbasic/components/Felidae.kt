package id.littleflower.oopbasic.components

abstract class Felidae : Mamalia() {

    override fun voraType(): VoraType {
        return VoraType.KARNIVORA
    }

}