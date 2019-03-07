package demo.domain

import spock.lang.Specification

class OrderSpec extends Specification {

    def "SetQuantity"() {
        given:
        def order = new Order();

        when: "add only one item"
        order.setQuantity(5);

        then: "expect value of the item"
        order.getQuantity() == 5
    }

    def "SetItemName"() {
        given:
        def order = new Order();

        when: "add only one item"
        order.setItemName("apple")

        then: "expect value of the item"
        order.getItemName() == "apple"

    }

    def "SetPrice"() {
        given:
        def order = new Order()

        when: "add only one item"
        order.setPrice(55)

        then: "expect value of the item"
        order.getPrice() == 55
    }

    def "SetPriceWithTex"() {
        given:
        def order = new Order()

        when: "add only one item"
        order.setPrice(60.2)

        then: "expect value of the item"
        order.getPrice() == 60.2
    }
}
