package external.pokemon_gen_one

trait PokemonGenOne {
  def name: String
}

trait Evolution {
  def evolution: PokemonGenOne
}

object Charmander extends PokemonGenOne with Evolution {
  override def name: String = "Charmander"
  override def evolution: PokemonGenOne = Charmillion
}

object Charmillion extends PokemonGenOne with Evolution {
  override def name: String = "Charmillion"
  override def evolution: PokemonGenOne = Charizard
}

object Charizard extends PokemonGenOne {
  override def name: String = "Charizard"
}
