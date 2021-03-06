package com.example.ds

import com.example.ds.arrays.printMatrixInCyclicManner
import com.example.ds.arrays.rotateMatrixInCyclicManner
import com.example.ds.dataStructures.binaryTree.BinaryNode
import com.example.ds.dataStructures.binaryTree.findFirstCommonParent
import com.example.ds.dataStructures.binaryTree.formABinarySearchTreeFrom
import com.example.ds.helper.print
import com.example.ds.knapSacks.findMaximumValueFromWeights

class Learning {

    companion object {
        @JvmStatic
        fun main(array : Array<String>?) {
            //learnKadaneAlgorithm()
            /*val intArray = arrayOf(1,2,3,4,5)
            com.example.ds.helper.quickSort(array = intArray)
            intArray.forEach { System.out.print("$it ") }*/
            //System.out.println(findMaximumValueFromWeights(intArrayOf(10,20,30), intArrayOf(60,100,120),50))
            //val tree = formABinarySearchTreeFrom(arrayOf(7,4,10,3,6,1,2,5,9,12,8,11,13))
            //System.out.println(findFirstCommonParent(tree, BinaryNode(2), BinaryNode(4)))
            //printMatrixInCyclicManner(arrayOf(arrayOf(1,10,9),arrayOf(2,11,8), arrayOf(3,12,7), arrayOf(4,5,6)), true)
            val intArray = arrayOf(arrayOf(1,2,3,4), arrayOf(12,13,14,5), arrayOf(11,16,15,6), arrayOf(10,9,8,7))
            intArray.print()
            System.out.println("-----------------")
            rotateMatrixInCyclicManner(intArray, true)
            intArray.print()
        }
    }
}

