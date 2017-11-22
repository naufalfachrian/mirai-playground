package id.littleflower.oopbasic.components

abstract class Bird : Animal {

    override fun viparType(): ViparType {
        return ViparType.OVIPAR
    }

    open fun canFly(): Boolean {
        return true
    }

}