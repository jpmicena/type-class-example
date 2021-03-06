package app.domain

trait Trainer[A] {
  def train(pokemon: A): A
}

object Syntax {
  implicit class TrainerOps[A](pokemon: A) {
    def trained(implicit trainer: Trainer[A]): A =
      trainer.train(pokemon)
  }
}

object Utils {
  import Syntax._

  def allEvolutions[A](pokemon: A)(implicit trainer: Trainer[A]): Set[A] = Set(
    pokemon,
    pokemon.trained,
    pokemon.trained.trained
  )
}
