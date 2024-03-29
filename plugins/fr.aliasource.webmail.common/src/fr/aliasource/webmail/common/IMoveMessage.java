/* ***** BEGIN LICENSE BLOCK *****
 * Version: GPL 2.0
 *
 * The contents of this file are subject to the GNU General Public
 * License Version 2 or later (the "GPL").
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Initial Developer of the Original Code is
 *   minig.org project members
 *
 * ***** END LICENSE BLOCK ***** */

package fr.aliasource.webmail.common;

import java.util.Collection;
import java.util.Set;

import fr.aliasource.webmail.common.folders.IFolder;

public interface IMoveMessage {
	
	Set<String> moveMessage(IFolder dest, String convId, Collection<Long> messIds);
}
