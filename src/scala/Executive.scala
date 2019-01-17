package scala{
  package professional{
    class Executive {
      private[professional] var workDetails = null
      private[scala] var friends = null
      private[this] var secrets = null

      def help(another: Executive): Unit ={
        println(another.workDetails)
        println(another.friends)
//        println(another.secrets) 报错权限不足
      }
    }
  }
}

