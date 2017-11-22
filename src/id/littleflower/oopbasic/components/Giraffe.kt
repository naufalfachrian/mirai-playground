package id.littleflower.oopbasic.components

class Giraffe : Mamalia() {

    override fun voice(): String {
        return "...."
    }

    override fun voraType(): VoraType {
        return VoraType.HERBIVORA
    }
}