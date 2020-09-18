package app.infra.pokemon_gen_two

import app.domain.Trainer
import external.pokemon_gen_two.{NextForm, PokemonGenTwo}

object Implicits {
  implicit val genTwoTrainer: Trainer[PokemonGenTwo] =
    new Trainer[PokemonGenTwo] {
      override def train(pokemon: PokemonGenTwo): PokemonGenTwo = pokemon match {
        case pokemon: NextForm => pokemon.nextForm
        case pokemon => pokemon
      }
    }
}
