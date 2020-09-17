package app

import domain.Syntax._
import infra.pokemon_gen_one.Implicits._

import external.pokemon_gen_one._

object Main extends App {

  val genOnePokemon: PokemonGenOne = Charmander

  println("My pokemon trained once and became: " + genOnePokemon.trained.name)
  println("My pokemon trained twice and became: " + genOnePokemon.trained.trained.name)
  println("My pokemon trained thrice and became: " + genOnePokemon.trained.trained.trained.name)

}
