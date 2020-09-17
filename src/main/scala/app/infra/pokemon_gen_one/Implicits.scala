package app.infra.pokemon_gen_one

import app.domain.Trainer
import external.pokemon_gen_one.{Evolution, PokemonGenOne}

object Implicits {
  implicit val genOneTrainer: Trainer[PokemonGenOne] =
    new Trainer[PokemonGenOne] {
      override def train(pokemon: PokemonGenOne): PokemonGenOne = pokemon match {
        case pokemon: Evolution => pokemon.evolution
        case pokemon => pokemon
      }
    }


}
